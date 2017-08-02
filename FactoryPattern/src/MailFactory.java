/**
 * @author fang
 * @creatdate 17-8-2
 */
public class MailFactory {
    public static <T extends Mail> T createMail(String str){
        Mail mail = null;
        try{
            if(str.equals("http")){
                mail = (Mail)Class.forName("HttpMail").newInstance();
            }else if(str.equals("pop")){
                mail = (Mail)Class.forName("POPMail").newInstance();
            }else if(str.equals("imap")){
                mail = (Mail)Class.forName("IMAPMail").newInstance();
            }else{
                throw new ClassNotFoundException();
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return (T)mail;
    }
}
