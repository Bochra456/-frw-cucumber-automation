Feature: Verifier l enregistrement 

  En tant que utilisateur
  Je souhaite remplir le formulaire
  Afin de m enregistrer sur le site Mercury
  
  @multiple1
  Scenario Outline: création des plusieurs comptes aux plusieurs utlisateurs
   Given l utilisateur est sur la page d inscription de l application mercury
    When il saisit un first name valide pour multiple "<firstname>"
    And il saisit un last name valide pour multiple "<lastname>"
    And il saisit un email valide pour multiple "<email>"
    And il saisit un téléphone valide pour multiple "<phone>"
    And il saisit un adresse valide pour multiple "<adresse>"
    And il saisit un gouvernerat valide pour multiple "<city>"
    And il saisit un province valide pour multiple "<province>"
    And il saisit un code postale valide pour multiple "<codePostale>"
    And il saisit un pays de residence valide pour multiple "<country>"
    And il saisit un UserName valide pour multiple "<username>"
    And il saisit un mot de passe valide pour multiple "<password>"
    And il confirme le mot de passe pour multiple "<confirmpassword>"
    And il clique sur le bouton "envoyer"
    Then  un message de confirmation est affiché deux fois "<message>"
    
    Examples:
    
    
  | firstname | lastname | email             | phone    | adresse | city  | province | codePostale| country | username | password |         confirmpassword    |                         message                                                                            |
  | Houda     | Hani     | houda@gmail.com   | 51243666 |  3 Ariana  | Tunis | tunis    | 2080       | TUNISIA | Houda    | Houda123 |            Houda123        |      Thank you for registering. You may now sign-in using the user name and password you've just entered.  |
  |  Ali      |Chourabi  | Ali@gmail.com     | 26789050 | 46 Bardou  | Tunis |tunis     | 2090       | TUNISIA | ALI      | Ali123   |               Ali123       |   Thank you for registering. You may now sign-in using the user name and password you've just entered.     |
    
