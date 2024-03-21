import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gu {

    public static void main(String[] args) {
        String inputFile = "ClassDiagram.dotuml";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            StringBuilder classBuffer = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                // Vérifier si la ligne contient une classe
                if (line.trim().startsWith("class")) {
                    // Traiter la classe précédente
                    if (classBuffer.length() > 0) {
                        generateJavaCode(classBuffer.toString());
                        classBuffer.setLength(0);
                    }
                    // Commencer à traiter une nouvelle classe
                    classBuffer.append(line).append("\n");
                } else {
                    // Ajouter les autres lignes à la classe actuelle
                    classBuffer.append(line).append("\n");
                }
            }
            // Traiter la dernière classe
            if (classBuffer.length() > 0) {
                generateJavaCode(classBuffer.toString());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateJavaCode(String classString) {
        // Extraire le nom de la classe
        Pattern pattern = Pattern.compile("class\\s+(\\w+)\\s*\\{");
        Matcher matcher = pattern.matcher(classString);
        if (matcher.find()) {
            String className = matcher.group(1);
            String fileName = className + ".java";
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                // Écrire le contenu de la classe Java
                writer.write("public class " + className + " {\n");

                // Extraire les attributs et les méthodes
                pattern = Pattern.compile("(private|public)\\s+(\\w+)\\s+(\\w+)\\(([^)]*)\\)\\s*(:\\s*(\\w+))?;");
                matcher = pattern.matcher(classString);
                while (matcher.find()) {
                    String accessModifier = matcher.group(1);
                    String returnType = matcher.group(2);
                    String methodName = matcher.group(3);
                    String params = matcher.group(4);
                    String returnTypeText = (matcher.group(6) != null) ? matcher.group(6) : "";
                    
                    // Écrire le code de la méthode
                    writer.write("    " + accessModifier + " " + returnType + " " + methodName + "(" + params + ") {\n");
                    writer.write("        // Ajouter l'implémentation de la méthode ici\n");
                    writer.write("    }\n");
                }

                writer.write("}\n");
                writer.close();
                System.out.println("Fichier Java généré : " + fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
