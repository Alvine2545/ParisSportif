## Modélisation UML

### Diagramme d'etat transition
**Evenement**
    L'événement commence dans l'état "NonCommence". Il peut soit passer à l'état "EnCours" lorsqu'il est déclenché (créer, mise à jour de sa date, ...).
    Dans l'état "EnCours", l'événement sportif peut soit se terminer normalement et passer à l'état "Terminer", soit être annulé avant la date de fin.
    Une fois que l'événement est terminé, il passe à l'état "Termine" où les résultats peuvent être annoncés.
    Si l'événement est annulé, il reste dans l'état "Annuler".