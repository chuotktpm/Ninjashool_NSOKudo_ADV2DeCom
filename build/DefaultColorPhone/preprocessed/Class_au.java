
// Source code is decompiled from a .class file using FernFlower decompiler.
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public final class Class_au extends Form implements CommandListener {
   private TextField a;
   private TextField b;
   private TextField c;
   private Command d;
   private static Class_au e;

   public Class_au() {
      super("Cài up time - Cài all 0 để up full time");
      this.append(this.a = new TextField("Ngày up", "", 3, 2));
      this.append(this.b = new TextField("Giờ up", "", 3, 2));
      this.append(this.c = new TextField("Phút up", "", 3, 2));
      this.addCommand(this.d = new Command("Lưu", 4, 0));
      this.addCommand(new Command("Thoát", 7, 0));
      this.setCommandListener(this);
   }

   public static Class_au a() {
      if (e == null) {
         e = new Class_au();
      }

      return e;
   }

   public final void b() {
      long var2 = Code.ac / 60000L;
      this.c.setString(String.valueOf(var2 % 60L));
      var2 /= 60L;
      this.b.setString(String.valueOf(var2 % 60L));
      var2 /= 60L;
      this.a.setString(String.valueOf(var2));
      Display.getDisplay(GameMidlet.instance).setCurrent(this);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.d) {
         int var5 = 0;
         int var6 = 0;
         int var3 = 0;

         try {
            var5 = Integer.parseInt(this.a.getString());
            var6 = Integer.parseInt(this.b.getString());
            var3 = Integer.parseInt(this.c.getString());
         } catch (Exception var4) {
         }

         Code.ac = ((long)(var5 * 24 + var6) * 60L + (long)var3) * 60L * 1000L;
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.instance);
      MotherCanvas.instance.setFullScreenMode(true);
   }
}
