package primus.pawel;
// Dubstep
// 6kyu
// https://www.codewars.com/kata/551dc350bf4e526099000ae5
// 2021-03-24 T:00:38:51
class Exercise_039 {

    public static String SongDecoder (String song)
    {
        return song.replace("WUB", " ").replaceAll("\\s+", " ").trim();
    }

    public static void main(String[] args) {

        System.out.println(SongDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
    }

}
