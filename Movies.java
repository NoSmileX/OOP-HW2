package org.example.cinema;


public class Movies {
    private String titleOfMovie;
    private String dateOfSession;

    public Movies(String titleOfMovie, String dateOfSession) {
        this.titleOfMovie = titleOfMovie;
        this.dateOfSession = dateOfSession;
    }

    public Movies() {
    }

    public String getTitleOfMovie() {
        return titleOfMovie;
    }

    public void setTitleOfMovie(String titleOfMovie) {
        this.titleOfMovie = titleOfMovie;
    }

    public String getDateOfSession() {
        return dateOfSession;
    }

    public void setDateOfSession(String dateOfSession) {
        this.dateOfSession = dateOfSession;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "titleOfMovie='" + titleOfMovie + '\'' +
                ", dateOfSession=" + dateOfSession +
                '}';
    }
}
