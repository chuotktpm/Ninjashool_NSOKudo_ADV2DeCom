import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public final class cc extends Form implements CommandListener {
   private TextField aaa;
   private TextField aba;
   private TextField aca;
   private Command ada;
   private static cc aea;

   public cc() {
      super("Cài up time - Cài all 0 để up full time");
      this.append(this.aaa = new TextField("Ngày up", "", 3, 2));
      this.append(this.aba = new TextField("Giờ up", "", 3, 2));
      this.append(this.aca = new TextField("Phút up", "", 3, 2));
      this.addCommand(this.ada = new Command("Lưu", 4, 0));
      this.addCommand(new Command("Thoát", 7, 0));
      this.setCommandListener(this);
   }

   public static cc aaa() {
      if (aea == null) {
         aea = new cc();
      }

      return aea;
   }

   public final void aba() {
      long var2 = Code.bda / 60000L;
      this.aca.setString(String.valueOf(var2 % 60L));
      var2 /= 60L;
      this.aba.setString(String.valueOf(var2 % 60L));
      var2 /= 60L;
      this.aaa.setString(String.valueOf(var2));
      Display.getDisplay(Class_ab.aja).setCurrent(this);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.ada) {
         int var5 = 0;
         int var6 = 0;
         int var3 = 0;

         try {
            var5 = Integer.parseInt(this.aaa.getString());
            var6 = Integer.parseInt(this.aba.getString());
            var3 = Integer.parseInt(this.aca.getString());
         } catch (Exception var4) {
         }

         Code.bda = ((long)(var5 * 24 + var6) * 60L + (long)var3) * 60L * 1000L;
      }

      Display.getDisplay(Class_ab.aja).setCurrent(fg.aaa);
      fg.aaa.setFullScreenMode(true);
   }

   public static void aca() {
   }

   static {
      aa.aaa(17);
      aca();
   }

   public static void ada() {
      aea = null;
   }
}
