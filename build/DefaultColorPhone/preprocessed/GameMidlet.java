
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.InputStream;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class GameMidlet extends MIDlet {
   public static byte CLIENT_TYPE;
   public static int port;
   public static String IP;
   public static byte userProvider;
   public static String clientAgent;
   public static GameMidlet instance;
   public static byte typeArea;

   static {
      CLIENT_TYPE = 1;
      port = 14444;
      IP = "";
      userProvider = 0;
      typeArea = 0;
      
   }

   public GameMidlet() {
      Session_ME sessionME = Session_ME.getInstance();
      Controller controller = Controller.getInstance();
      sessionME.d = controller;
      instance = this;
      ServerInfo.readListServerInfo();
      clientAgent = b("agent.txt");
      userProvider = Byte.parseByte(b("provider.txt"));
      System.out.println("AGENT: " + clientAgent + ", PROVIDER: " + userProvider);
      Class_gc.a = 0;
      GameCanvas.ad = new Class_gc();
      GameCanvas var2 = GameCanvas.b();
      MotherCanvas.getInstance().tCanvas = var2;
      MotherCanvas mCanvas = MotherCanvas.getInstance();
      Display.getDisplay(this).setCurrent(mCanvas);
      mCanvas = MotherCanvas.getInstance();
      if (!MotherCanvas.c) {
         (new Thread(mCanvas)).start();
      }
      

   }

   protected void destroyApp(boolean var1) {
   }

   protected void pauseApp() {
   }

   protected void startApp() {
   }

   public static void a(String var0) {
      if (!var0.equals("")) {
         try {
            instance.platformRequest(var0);
            instance.notifyDestroyed();
            return;
         } catch (ConnectionNotFoundException var1) {
            var1.printStackTrace();
         }
      }

   }

   private static String b(String var0) {
      InputStream var3 = RMS.a("/" + var0);

      try {
         byte[] var1 = new byte[var3.available()];
         var3.read(var1);
         var0 = new String(var1, "UTF-8");
      } catch (Exception var2) {
         var0 = "";
      }

      return var0;
   }
}
