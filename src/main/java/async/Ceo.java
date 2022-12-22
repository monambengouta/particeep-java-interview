package async;

class Ceo {
  private String id;
  private String name;


  public Ceo(String id, String name) {
    this.id = id;
    this.name = name;
  }

  // getters and setters
  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Ceo ceo = (Ceo) o;

    if (id != null ? !id.equals(ceo.id) : ceo.id != null) return false;
    return name != null ? name.equals(ceo.name) : ceo.name == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }


  public String toString() {
    return "Ceo_" + name;
  }
}
