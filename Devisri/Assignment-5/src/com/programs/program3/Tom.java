package com.programs.program3;

public class Tom extends Marks{
    private int java;
    private int python;
    private int php;
    private int dotnet;

    public Tom(int java, int python, int php, int dotnet) {
        this.java = java;
        this.python = python;
        this.php = php;
        this.dotnet = dotnet;
    }

    @Override
    public int getPercentage() {
        return (java+python+php+dotnet)/4;
    }
}
