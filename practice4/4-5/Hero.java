public class Hero {
  String name;
  int hp;

  public boolean equals(Object o) {
    if(o == this) return true;
    if(o == null) return false;
    if(!(o instanceof Hero)) return false;
    Hero r = (Hero) o;
    if(!this.name.equals(r.name)) {
      return false;
    }
    return true;
  }

  public int hashCode() {
    int result = 37;
    result = result * 31 + name.hashCode();
    result = result * 31 + hp;
    return result;
  }
}