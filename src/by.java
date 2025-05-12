import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;

public final class by implements CommandListener {
   private eq aaa;
   private final TextBox aba;

   by(eq var1, TextBox var2) {
      this.aaa = var1;
      this.aba = var2;
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1.getLabel().equals(er.dca)) {
         this.aaa.aaa(this.aba.getString());
      }

      Display.getDisplay(Class_ab.aja).setCurrent(fg.aaa);
      fg.aaa.setFullScreenMode(true);
      this.aaa.ata = true;
   }
}
