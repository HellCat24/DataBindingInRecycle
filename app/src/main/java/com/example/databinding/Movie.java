package com.example.databinding;

/**
 * Created by omazhukin on 9/3/2015.
 */
public class Movie {

    public boolean isWatched;
    public String image;
    public String description;
    public String title;

    public Movie(boolean isWatched, String image, String description, String title) {
        this.isWatched = isWatched;
        this.image = image;
        this.description = description;
        this.title = title;
    }

    public static Movie[] ITEMS = new Movie[]{
            new Movie(false, "http://i.ytimg.com/vi/oj39N36pYPA/maxresdefault.jpg", "Attack on Titan (進撃の巨人 Shingeki no Kyojin?) is a 2015 Japanese dark fantasy action horror film based on the manga series of the same name by Hajime Isayama.", "Attack On The Titans"),
            new Movie(false, "https://pic.yify-torrent.org/2006/32233/7c72074e27054d6b8fff4d68f7868916.png", "A Scanner Darkly is a 2006 American adult animated science fiction thriller film directed by Richard Linklater based on the novel of the same name by Philip K. Dick.", "A Scanner Darkly"),
            new Movie(true, "http://vignette3.wikia.nocookie.net/marvelmovies/images/c/cf/X-men_team.png/revision/latest?cb=20110311174912", "X-Men: The Last Stand (also known as X-Men 3 or X3)[5] is a 2006 American superhero film, based on the X-Men superhero team introduced in Marvel Comics. ", null),
            new Movie(true, "https://thenypost.files.wordpress.com/2014/11/tv_odyssey2.jpg", "2001: A Space Odyssey is a 1968 epic science fiction film produced and directed by Stanley Kubrick. The screenplay, written by Kubrick and Arthur C. Clarke, was partially inspired by Clarke's short story \"The Sentinel\". Clarke concurrently wrote the novel 2001: A Space Odyssey, published soon after the film was released. ", "2001: A Space Odyssey"),
            new Movie(true, "http://www.dan-dare.org/FreeFun/Images/Archive/Spider-Man2Wallpaper1024.jpg", "Spider-Man 2 is a 2004 American superhero film directed by Sam Raimi and written by Alvin Sargent from a story by Alfred Gough, Miles Millar, and Michael Chabon. The sequel to the 2002 film Spider-Man, it is the second film in Raimi's Spider-Man film trilogy based on the fictional Marvel Comics character of the same name.", "Spider-Man 2"),
            new Movie(false, "https://upload.wikimedia.org/wikipedia/en/2/20/Batman_v_Superman_poster.jpg", "Batman v Superman: Dawn of Justice is an upcoming American superhero film featuring the DC Comics characters Batman and Superman, distributed by Warner Bros. Pictures. It is intended to be the follow-up to 2013's Man of Steel and the second installment in the DC Extended Universe. ", "Batman v Superman"),
            new Movie(true, "http://www.hollywoodreporter.com/sites/default/files/imagecache/675x380/2014/06/77_Ghostbusters.jpg", "Ghostbusters is a 1984 American supernatural comedy film,[2][3] directed and produced by Ivan Reitman and written by Dan Aykroyd and Harold Ramis. The film stars Bill Murray, Aykroyd, and Ramis as three eccentric parapsychologists in New York City who start a ghost-catching business.", "Ghostbusters"),
            new Movie(false, "http://www.film.ru/sites/default/files/images/anime-my-neighbor-totoro.jpg", "My Neighbor Totoro (Japanese: となりのトトロ Hepburn: Tonari no Totoro?) is a 1988 Japanese animated fantasy film written and directed by Hayao Miyazaki and produced by Studio Ghibli. The film – which stars the voice actors Noriko Hidaka, Chika Sakamoto, and Hitoshi Takagi – tells the story of the two young daughters (Satsuki and Mei) of a professor and their interactions with friendly wood spirits in postwar rural Japan. ", "My Neighbor Totoro"),
            new Movie(true, "https://viewerscommentary.files.wordpress.com/2011/09/shaun-of-the-dead-zombie-crowd.jpg", "Shaun of the Dead is a 2004 British-French-American horror comedy film directed by Edgar Wright and written by Wright and Simon Pegg, and starring Pegg and Nick Frost. Pegg plays Shaun, a man attempting to get some kind of focus in his life as he deals with his girlfriend, his mother and stepfather.[6] At the same time, he has to cope with an apocalyptic zombie uprising.", "Shaun of the Dead")
    };
}
