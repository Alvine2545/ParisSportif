## Modélisation UML

### Diagramme d'etat transition
**Parieur**
    Un Parieur commence dans l'état "Inscrit". Après inscription ou connexion, il passe à l'état "Connecter".
S'il y a une erreur de saisi d'informations ou autres erreur quelconques, le compte demeurre dans l'état déconnecter. Si tout ce passe bien, il passe à l'état *connecter*
Lorsque le Parieur se déconnecte, il passe à l'état *déconnecter* et peut se reconnecter ultérieurement