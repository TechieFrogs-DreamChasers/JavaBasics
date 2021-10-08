//Concatenate two arrays
public class Program41 {
    public static void main(String[] args) {
        int size = 5;
        String[][][] strings1 = {
                {{"Ang", "Ann", "Alf", "An", "Al"},
                        {"Bob", "Ben", "Bi", "Bry", "Bro"},
                        {"Car", "Cha", "Car", "Chl", "Cad"},
                        {"Dev", "Dan", "Dyl", "Dam", "Deb"},
                        {"Ev", "Eva", "Emm", "El", "Ele"}},
                {{"Fab", "Fi", "Fra", "Fr", "Fran"},
                        {"Gra", "Gre", "Gin", "Gr", "Gle"},
                        {"Har", "Ha", "Hay", "Hec", "Hud"},
                        {"Ire", "Irv", "Ir", "Ia", "Iv"},
                        {"Jo", "Jo", "Je", "Ju", "Ja"}},
                {{"Ko", "Kev", "Kyl", "Kad", "Ky"},
                        {"Le", "Lu", "Log", "Lo", "Lu"},
                        {"Meg", "Ma", "Ma", "Min", "Mi"},
                        {"Nat", "Nor", "No", "Ni", "Na"},
                        {"Op", "Ol", "Osc", "Oli", "Od"}},
                {{"Pat", "Phe", "Pet", "Pa", "Pri"},
                        {"Ro", "Re", "Ra", "Ri", "Row"},
                        {"St", "Sh", "Sie", "Sa", "Sun"},
                        {"Tre", "Ty", "Tho", "Tob", "To"},
                        {"Va", "Vi", "Van", "Vau", "Vic"}},
                {{"Wi", "Wes", "West", "Wa", "Wal"},
                        {"Sha", "Spa", "Saw", "Sam", "Se"},
                        {"Pa", "Pe", "Pi", "Po", "Pr"},
                        {"Ad", "Al", "Ar", "Aar", "Ad"},
                        {"Matt", "Mi", "Ma", "Me", "Mo"}}
        };
        String[][][] strings2 = {
                {{"ela", "ie", "ie", "na", "ma"},
                        {"by", "ny", "ll", "son", "ok"},
                        {"los", "se", "ter", "oe", "en"},
                        {"on", "iel", "on", "on", "bie"},
                        {"e", "an", "a", "ma", "na"}},
                {{"ian", "nn", "nk", "eya", "cis"},
                        {"nt", "ene", "ni", "eg", "nn"},
                        {"ry", "nk", "ley", "tor", "son"},
                        {"ne", "in", "is", "n", "an"},
                        {"hn", "e", "nny", "dy", "ck"}},
                {{"le", "in", "er", "en", "le"},
                        {"o", "ke", "an", "ki", "ca"},
                        {"han", "y", "x", "nie", "ck"},
                        {"hon", "ma", "el", "ck", "te"},
                        {"ie", "ga", "ar", "ver", "in"}},
                {{"rick", "obe", "e", "rk", "nce"},
                        {"man", "ge", "y", "ck", "an"},
                        {"an", "aw", "rra", "ra", "ny"},
                        {"vor", "ler", "mas", "ias", "ny"},
                        {"n", "cky", "ce", "ghn", "tor"}},
                {{"ll", "ley", "on", "de", "ker"},
                        {"ne", "de", "yer", "uel", "al"},
                        {"sh", "pe", "tt", "rt", "im"},
                        {"a", "an", "ri", "on", "am"},
                        {"eo", "ch", "cy", "rl", "ss"}}
        };
        String[][][] string = new String[size][size][size];
        System.out.println("String-1: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    System.out.print(strings1[i][j][k] + " ");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
            System.out.println("------------------------------------------------------------------------------------------------------------");

        }
        System.out.println("String-2: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    System.out.print(strings2[i][j][k] + " ");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
            System.out.println("----------------------------------------------------------------------------------------");
        }
        System.out.println("String Concat: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    string[i][j][k] = strings1[i][j][k] + strings2[i][j][k];
                    System.out.print(string[i][j][k] + " | ");
                }
                System.out.println(" ");
                System.out.println("---------------------------------------------");
            }
            System.out.println(" ");
        }
    }
}
/*
String-1:
Ang Ann Alf An Al  Bob Ben Bi Bry Bro  Car Cha Car Chl Cad  Dev Dan Dyl Dam Deb  Ev Eva Emm El Ele
------------------------------------------------------------------------------------------------------------
Fab Fi Fra Fr Fran  Gra Gre Gin Gr Gle  Har Ha Hay Hec Hud  Ire Irv Ir Ia Iv  Jo Jo Je Ju Ja
------------------------------------------------------------------------------------------------------------
Ko Kev Kyl Kad Ky  Le Lu Log Lo Lu  Meg Ma Ma Min Mi  Nat Nor No Ni Na  Op Ol Osc Oli Od
------------------------------------------------------------------------------------------------------------
Pat Phe Pet Pa Pri  Ro Re Ra Ri Row  St Sh Sie Sa Sun  Tre Ty Tho Tob To  Va Vi Van Vau Vic
------------------------------------------------------------------------------------------------------------
Wi Wes West Wa Wal  Sha Spa Saw Sam Se  Pa Pe Pi Po Pr  Ad Al Ar Aar Ad  Matt Mi Ma Me Mo
------------------------------------------------------------------------------------------------------------
String-2:
ela ie ie na ma  by ny ll son ok  los se ter oe en  on iel on on bie  e an a ma na
----------------------------------------------------------------------------------------
ian nn nk eya cis  nt ene ni eg nn  ry nk ley tor son  ne in is n an  hn e nny dy ck
----------------------------------------------------------------------------------------
le in er en le  o ke an ki ca  han y x nie ck  hon ma el ck te  ie ga ar ver in
----------------------------------------------------------------------------------------
rick obe e rk nce  man ge y ck an  an aw rra ra ny  vor ler mas ias ny  n cky ce ghn tor
----------------------------------------------------------------------------------------
ll ley on de ker  ne de yer uel al  sh pe tt rt im  a an ri on am  eo ch cy rl ss
----------------------------------------------------------------------------------------
String Concat:
Angela | Annie | Alfie | Anna | Alma |
---------------------------------------------
Bobby | Benny | Bill | Bryson | Brook |
---------------------------------------------
Carlos | Chase | Carter | Chloe | Caden |
---------------------------------------------
Devon | Daniel | Dylon | Damon | Debbie |
---------------------------------------------
Eve | Evaan | Emma | Elma | Elena |
---------------------------------------------

Fabian | Finn | Frank | Freya | Francis |
---------------------------------------------
Grant | Greene | Ginni | Greg | Glenn |
---------------------------------------------
Harry | Hank | Hayley | Hector | Hudson |
---------------------------------------------
Irene | Irvin | Iris | Ian | Ivan |
---------------------------------------------
John | Joe | Jenny | Judy | Jack |
---------------------------------------------

Kole | Kevin | Kyler | Kaden | Kyle |
---------------------------------------------
Leo | Luke | Logan | Loki | Luca |
---------------------------------------------
Meghan | May | Max | Minnie | Mick |
---------------------------------------------
Nathon | Norma | Noel | Nick | Nate |
---------------------------------------------
Opie | Olga | Oscar | Oliver | Odin |
---------------------------------------------

Patrick | Pheobe | Pete | Park | Prince |
---------------------------------------------
Roman | Rege | Ray | Rick | Rowan |
---------------------------------------------
Stan | Shaw | Sierra | Sara | Sunny |
---------------------------------------------
Trevor | Tyler | Thomas | Tobias | Tony |
---------------------------------------------
Van | Vicky | Vance | Vaughn | Victor |
---------------------------------------------

Will | Wesley | Weston | Wade | Walker |
---------------------------------------------
Shane | Spade | Sawyer | Samuel | Seal |
---------------------------------------------
Pash | Pepe | Pitt | Port | Prim |
---------------------------------------------
Ada | Alan | Arri | Aaron | Adam |
---------------------------------------------
Matteo | Mich | Macy | Merl | Moss |
---------------------------------------------
 */
