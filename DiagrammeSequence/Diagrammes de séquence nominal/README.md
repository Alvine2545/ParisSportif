## Modélisation UML

### Diagramme de séquence
**Cas d'utilisation: Placer pari**
-Scénario Nominal
    1. Le parieur demande la page pour placer un pari
    2. Le système lui envoies la  page avec le formulaire de placement du pari.
    3. Le parieur remplit et envoie le formulaire de pari avec le montant, l'événement, le type de pari et le résultat parié au Système.
    4. Le Système valide d'abord le montant pour s'assurer que le Parieur dispose de suffisamment de fonds; vérifie le solde du Parieur pour s'assurer qu'il peut placer le pari; calcule la cote pour l'événement et le type de pari spécifié.
    5.Le Parieur est informé de la cote et le montant est débité de son compte.
    6.Le Système met à jour les informations sur le pari dans le système.
    7.Le Parieur reçoit une confirmation que le pari a été placé avec succès.