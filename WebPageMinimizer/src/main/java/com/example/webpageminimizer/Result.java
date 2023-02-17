package com.example.webpageminimizer;

public class Result {
    public String getOriginal() {
        return original;
    }

    public String getReduced() {
        return reduced;
    }

    public Result(String original, String reduced) {
        this.original = original;
        this.reduced = reduced;
    }

    private String original;
    private String reduced;

}
