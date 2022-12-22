package async;

class Enterprise {
 private String id;
 private String name;
 private String ceo_id;

  public Enterprise(String id, String name, String ceo_id) {
    this.id = id;
    this.name = name;
    this.ceo_id = ceo_id;
  }

  //getters and setters
  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getCeo_id() {
    return ceo_id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Enterprise that = (Enterprise) o;

    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    return ceo_id != null ? ceo_id.equals(that.ceo_id) : that.ceo_id == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (ceo_id != null ? ceo_id.hashCode() : 0);
    return result;
  }
  

  public String toString() {
    return "Enterprise_" + name;
  }
}
