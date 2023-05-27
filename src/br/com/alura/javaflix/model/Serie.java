package br.com.alura.javaflix.model;

public class Serie extends Title{
    private int seasons;
    private boolean active;
    private int episodesBySeason;
    private int minutesByEpisode;

    public Serie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesBySeason() {
        return episodesBySeason;
    }

    public void setEpisodesBySeason(int episodesBySeason) {
        this.episodesBySeason = episodesBySeason;
    }

    public int getMinutesByEpisode() {
        return minutesByEpisode;
    }

    public void setMinutesByEpisode(int minutesByEpisode) {
        this.minutesByEpisode = minutesByEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodesBySeason * minutesByEpisode;
    }

}
