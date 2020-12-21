public class CanBo {
    String name;
    String birthday;
    String homeTown;

    public CanBo(String name, String birthday, String homeTown) {
        this.name = name;
        this.birthday = birthday;
        this.homeTown = homeTown;
    }

    public CanBo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }
}
