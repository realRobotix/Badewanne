public class Badewanne
{
   // Datenfelder
   private int fassungsvermoegenWanne;
   private int eingelassenesWasser;
   private int wasserInBadewanne;
   
   /**
    * Das Wasser in der Wanne wird in ml angegeben.
    */
   public Badewanne( int FassungsvermoegenWanne ) {
      fassungsvermoegenWanne = FassungsvermoegenWanne;
      eingelassenesWasser = 0;
      wasserInBadewanne = 0;
    }

   /**
    * Methode wasserEinlassen simuliert das Einlassen der angegebenen 
	* Wassernenge in die Wanne (Volumen in ml)
    */
   // BITTE DIE SIGNATUR VERVOLLSTÄNDIGEN!
   public void wasserEinlassen( int eingelassenesWasser )  {
      this.eingelassenesWasser += eingelassenesWasser;
      this.wasserInBadewanne += eingelassenesWasser;
   }
   
   /**
	* Methode wasserAblassen simuliert das Ablassen der angegebenen 
	* Wassernenge aus der Wanne (Volumen in ml)
        */
   // BITTE DIE SIGNATUR VERVOLLSTÄNDIGEN!   
   public void wasserAblassen( int abgelassenesWasser )  {
      this.wasserInBadewanne -= abgelassenesWasser;
   }

   /**
    * Methode gibVolumen liefert das Volumen des Wassers in der Wanne
	* als Rückgabewert.
    */
   // BITTE DIE SIGNATUR VERVOLLSTÄNDIGEN!
   public int gibVolumen()  {
        return wasserInBadewanne;
   }  

   /**
    * Methode druckeVolumenAus gibt das Volumen des Wassers in der Wanne
	* und die Restkapazität der Wanne auf der Konsole aus.
    */
   // BITTE DIE SIGNATUR VERVOLLSTÄNDIGEN!
   public void druckeVolumenAus( )  {
      System.out.println("Volumen des Wassers: " + wasserInBadewanne + " l");
   }
   
   /**
    * Methode gibRestkapazitaet gibt das Volumen des Wassers zurück, 
	* das aktuell noch in die Wanne hineinpasst.
    */
   // BITTE DIE SIGNATUR VERVOLLSTÄNDIGEN!
   public int gibRestkapazitaet()  {
      return fassungsvermoegenWanne - wasserInBadewanne;
   }
}
