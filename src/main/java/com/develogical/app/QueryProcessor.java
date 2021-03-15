package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("newton")) {
            return "Sir Isaac Newton PRS (25 December 1642 – 20 March 1726) was an English mathematician, " +
                    "physicist, astronomer, theologian, and author (described in his time as a natural philosopher) " +
                    "who is widely recognised as one of the most influential scientists of all time and as a key figure in the scientific revolution.";
        }
        return "";
    }
}
