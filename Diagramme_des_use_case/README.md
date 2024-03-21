## Modélisation UML

### Diagramme des Cas d'utilisation

#### Acteurs :
- Parieur
- Bookmaker
- Tiers (Acteur secondaire car ayant rarement une interaction avec le système)

#### Cas d'utilisation :
- Placer pari (use case principal du système): effectué par un parieur; il lui permet de placer un pari sur un événement sportif en spécifiant les détails du pari et en soumettant le ticket au système.
    Préconditions : Le parieur doit être connecté au système et avoir suffisamment de jetons dans son compte.
    Postconditions : Le pari est enregistré dans le système, le compte du parieur est débité du montant du pari, et les cotes sont mises à jour en fonction du résultat du pari.

- Consulter les évènements: Un parieur peu venir consulter uniquement les évènements sportifs sans  placer  un pari.
    Préconditions : Aucune
    Postconditions : Voire les évènements disponible.

- Consulter les évènements: permet à un parieur de consulter les résultats de ses paris précédents.
    Préconditions :Le parieur doit être connecté au système et des paris précédents doivent exister pour le parieur.

- Faire mise à jour ou ajouter des données: éffectué par un les tiers pour mettre régulièrement à jour les données des evènements
    Préconditions : Tiers connecté
    Postconditions : Données à jour

- Gérer les paris événements sportifs: permet au bookmaker(Responsable de la gestion des événements sportifs proposés aux parieurs) de gérer les événements sportifs disponibles pour les paris.
    Préconditions : Le bookmaker doit être connecté au système.
    Postconditions : Evènement ajouté, mise à jour ou supprimé.

- Gérer compte utilisateur: permet à un parieur de gérer son compte utilisateur, y compris la consultation du solde et la mise à jour des informations personnelles.
    Préconditions : Le parieur doit être connecté au système.
    Postconditions : Modification de nom, mot de passe, ....

- Se connecter: Tout utilisateur du système doit se connecter
    Postconditions : Etre connecter au système.