
void setup()
{
  Cow deku = new Cow("cow", "moo");
  Chick todo = new Chick("chick", "cluck");
  NamedCow baku = new NamedCow("cow", "moo", "All Might");
  System.out.println(deku.getType() + " goes " + deku.getSound());
  System.out.println(todo.getType() + " goes " + todo.getSound());
  
	
}