package com.programs.program3;

public class John extends Marks{
    private int java;
    private int python;
    private int php;

    public John(int java, int python, int php) {
        this.java = java;
        this.python = python;
        this.php = php;
    }

    @Override
    public int getPercentage() {
        int percentage= (java+python+php)/3;
        return percentage;
    }
}
