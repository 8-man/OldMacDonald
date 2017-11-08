class Chick implements Animal 
{     
     private String myType;
     private String mySound;
     private String otherSound;
     public Chick(String type, String sound)
     {
       myType = "chick";
       mySound = "cluck";
       otherSound = "cheet";
     }
     public String getSound()
     {
      
      if(Math.random() > .5)
      {
        return mySound;
      }
     else
      {
       return otherSound;
      }
     }
     public String getType()
     {
       return myType;
       
     }
}