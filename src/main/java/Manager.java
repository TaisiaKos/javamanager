public class Manager {
    private final int defaultCountFilm;
    private String[] films = new String[0];

    public Manager(int defaultCountFilm) {
        this.defaultCountFilm = defaultCountFilm;
    }

    public Manager() {
        this.defaultCountFilm = 10;
    }

    public void add(String movie) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = movie;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < defaultCountFilm) {
            resultLength = films.length;
        } else {
            resultLength = defaultCountFilm;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}