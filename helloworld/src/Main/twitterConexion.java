package Main;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;

public  class twitterConexion {

    public Twitter conexionTwitter () throws TwitterException {

        ConfigurationBuilder configBuilder = new ConfigurationBuilder();
        configBuilder.setDebugEnabled(true).setOAuthConsumerKey("4POvGNcx1s62RwBH899kk2BT8")
                .setOAuthConsumerSecret("lsNySOeWVH7yaqSzh3TPjreyW3BMRBwVBx6x66fCSlfaFKTrbg")
                .setOAuthAccessToken("184079609-9ZSNSGiParEiPLntL2Tc88ZC6WSiMa2gKM6BeGPO")
                .setOAuthAccessTokenSecret("QBZAu54CNTLzozbCEOhk3qNgeoX1XnbwuZCQsUJjivkeg");

        TwitterFactory tf = new TwitterFactory(configBuilder.build());
        Twitter twitter = tf.getInstance();

        return twitter;
    }


    public String searchUser( String username) throws TwitterException {

        String st;
        try {  
            twitterConexion m = new twitterConexion(); // instanciar la clase
            Twitter twitter = m.conexionTwitter(); //conexion con twitter
            st = twitter.showUser(username).getScreenName(); //peticion a twitter para que me devuelva el nombre se usuario ingresado
            User u = twitter.showUser(st);
            System.out.println(u); // imprime el nombre de usuario
        }
        catch (TwitterException e) { //exception de la clase twitter.
        
            return "no existe el  usuario que introdujo";
            //System.out.println("no existe el  usuario que introdujo");
        }
        catch (Exception e) {// exception de la clase padre  Exception.
        
            return "no existe el  usuario que introdujo";
            //System.out.println("no existe el  usuario que introdujo");
        }
        return  st;


    }

}
