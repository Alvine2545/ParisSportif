## Modélisation UML

### Diagramme de classe
Le différentes classes:

    Parieur: représente un parieur dans le système, qui peut placer des paris sur différents événements sportif.
    EvenementSportif: représente un événement sportif pour lequel des paris peuvent être placés. Il est lié à un type sport spécifique.
    TypePari: représente les différents types de paris pris en charge dans le système.
    typeSport: représente les différents sports pour lesquels des événements peuvent être organisés. Ici on en a que 4:
        Course de cheveaux
        Tennis
        Football
        BasketBall
    Pari: représente un pari spécifique placé par un parieur sur un événement donné, avec un certain montant et un résultat parié. Il en existe deux ici:
        Avance
        Simple
    Bookmaker
    Tiers

- Régles de gestion

    1. Un parieur peut placé sur plusieurs paris
    2. Un pari est fait par plusieurs parieurs
    3. Un pari concerne un évènement sportif
    4. Un pari concerne un et un seul type de sport
    5. Un évènement sportif comporte plusieurs paries
    6. D’après les spécifications du sujet, on a 4 types de sports d’où la création les 4 classes spécifiques à la classe TypeSport
    7. Un pari à deux spécificités : on fait soit un parie simple soit un parie avancer
    8. Le bookmaker et le tiers ajoute et font des mises à jour sur les évènements sportifs






    