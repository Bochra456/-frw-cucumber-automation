Feature: 
je souhaite tester la page de connexion de l application swaglabs 


@login_valide
Scenario: je souhaite tester la page de connexion de l application swaglabs avec un cas valide
Given je me connect a l application swagLabs 

Then je me redirige vers la page d acceuil "Products"


@login_invalide
Scenario: je souhaite tester la page de connexion de l application swaglabs avec un cas non valide 
Given je me connect a l application swagLabs avec non correct coordonnes 

Then un message d erreur s affiche "Epic sadface: Username and password do not match any user in this service"