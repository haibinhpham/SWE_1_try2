/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_4;

/**
 *
 * @author ad
 */
class Developer {

    private String name;
    private int age;
    private int expyears;
    private String[] language;
    private String[] experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;

        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }

    }

    public int getExpyears() {
        return expyears;
    }

    public void setExpyears(int expyears) {
        if (expyears > 0) {
            this.expyears = expyears;

        }
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        if (language != null & language.length > 0) {
            this.language = language;

        }
    }

    public String[] getExperience() {
        return experience;
    }

    public void setExperience(String[] experience) {
        this.experience = experience;
    }

    public Developer(String name, int age, int expyears, String[] language, String[] experience) {
        this.name = name;
        this.age = age;
        this.expyears = expyears;
        this.language = language;
        this.experience = experience;
    }

    public static boolean isEmployed() {
        return true;
    }

    public static String currentCompany() {
        return "Tesla";
    }

}
