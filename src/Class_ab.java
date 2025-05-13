import java.io.IOException;
import java.io.InputStream;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class Class_ab extends MIDlet {
   public static String[] aaa;
   public static int[] aba;
   public static byte[] aca;
   public static int[] ada;
   public static byte aea;
   public static int afa;
   public static String aga;
   public static byte aha;
   public static String aia;
   public static Class_ab aja;
   public static byte aka;
   public static String[] ala;

   public Class_ab() {
      cs.aba().ada = Controller.aea();
      aja = this;
      aia = aba("agent.txt");
      aha = Byte.parseByte(aba("provider.txt"));
      System.out.println("AGENT: " + aia + ", PROVIDER: " + aha);
      ey.aaa = 0;
      GameCanvas.bda = new ey();
      fg.aaa().aba = GameCanvas.aba();
      if (!fg.aca) {
         (new Thread(fg.aaa())).start();
      }

   }

   protected void destroyApp(boolean var1) {
   }

   protected void pauseApp() {
   }

   protected void startApp() {
      Display.getDisplay(this).setCurrent(fg.aaa());
   }

   public static void aaa(String var0) {
      if (!var0.equals("")) {
         try {
            aja.platformRequest(var0);
            aja.notifyDestroyed();
            return;
         } catch (ConnectionNotFoundException var1) {
         }
      }

   }

   private static String aba(String var0) {
      InputStream var3 = fd.aaa("/".concat(String.valueOf(var0)));

      try {
         byte[] var1 = new byte[var3.available()];
         var3.read(var1);
         var0 = new String(var1, "UTF-8");
      } catch (IOException var2) {
         var0 = "";
      }

      return var0;
   }

   public static void aaa() {
      aaa = new String[]{gb.aaa, gb.aba};
      aba = new int[]{gb.aea, gb.aea};
      aca = new byte[]{0, 0};
      ada = new int[]{0, 1};
      aea = 1;
      afa = gb.afa;
      aga = "";
      aha = 0;
      aka = 0;
      ala = new String[]{gb.aca, gb.ada};
   }

   static {
      aa.aaa(0);
      aaa();
   }

   public static void aba() {
      aaa = null;
      aba = null;
      aca = null;
      ada = null;
      aea = 0;
      afa = 0;
      aga = null;
      aha = 0;
      aia = null;
      aja = null;
      aka = 0;
      ala = null;
   }
}
