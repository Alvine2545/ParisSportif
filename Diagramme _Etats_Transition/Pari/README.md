## Modélisation UML

### Diagramme d'etat transition
**Pari**
        Un pari commence dans l'état "Créer", où les mises sont acceptées. Dans ce état, il passé à l'état gérer par le bookmaker ou placer par le parieur
    Une fois que l'événement sur lequel le pari a été placé est terminé, les résultats sont finalisés et le pari peut être gagner ou perdu.