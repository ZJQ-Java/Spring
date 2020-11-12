package com.example.beanDemo;

public class People {
    private String nose;
    private String mouse;
    private User user;
    public String getNose() {
        return nose;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    public String getMouse() {
        return mouse;
    }

    public People(String nose, String mouse, User user) {
        this.nose = nose;
        this.mouse = mouse;
        this.user = user;
    }

    public People() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "People{" +
                "nose='" + nose + '\'' +
                ", mouse='" + mouse + '\'' +
                ", user=" + user +
                '}';
    }

    public void update(){
        this.setMouse("big");
        System.out.println(this);
    }

}
