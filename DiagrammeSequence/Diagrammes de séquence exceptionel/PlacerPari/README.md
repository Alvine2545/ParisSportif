
##Scénaires alternatifs

Ce diagramme de séquence capturent les interactions entre le parieur et le Système, pour les cas d'utilisation **Placer pari** sur un événement sportif et la gestion des exceptions liées à la validation du montant du pari.
## On a deux scénario exceptionels:
    Le montant du pari est invalide : Le système affiche un message d'erreur et le processus de pari est annulé.
    Le parieur n'a pas suffisamment de fonds : Le système refuse le pari et informe le parieur du solde insuffisant.

    Le Parieur envoie une demande de pari avec un montant, un événement, un type de pari et un résultat parié au Système.
    Le Système valide d'abord le montant pour s'assurer qu'il est valide.
    Si le montant est invalide, le Parieur reçoit un message d'erreur et le Système renvoie false pour indiquer que la validation a échoué.
    Si le montant est valide, le Système renvoie true pour indiquer que la validation a réussi.
