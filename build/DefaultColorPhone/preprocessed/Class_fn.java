
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;

public final class Class_fn implements CommandListener {
   private static ByteArrayInputStream d;
   private static DataInputStream e;
   private static ByteArrayOutputStream f;
   private static DataOutputStream g;
   private static RecordStore h;
   public static byte a = 1;
   private final Form i = new Form("C\u00e0i \u0111\u1eb7t NVDV <Linh SuSu>");
   private final Command j = new Command("L\u01b0u", 4, 1);
   private final Command k = new Command("H\u1ee7y", 3, 1);
   private final ChoiceGroup l = new ChoiceGroup("L\u00e0m NVHN!", 1, new String[]{"B\u1eadt", "T\u1eaft"}, new Image[2]);
   private TextField m;
   private TextField n;
   public static int b;
   public static int c;

   public Class_fn() {
      this.m = new TextField("H\u1eb9n Gi\u1edd L\u00e0m!", "" + b, 2, 2);
      this.n = new TextField("H\u1eb9n Ph\u00fat L\u00e0m!", "" + c, 2, 2);
   }

   public final void a() {
      this.i.append(this.l);
      this.i.append(this.m);
      this.i.append(this.n);
      this.i.addCommand(this.j);
      this.i.addCommand(this.k);
      this.i.setCommandListener(this);
      this.l.setSelectedIndex(a, true);
      a(this.i);
   }

   private static void a(Displayable var0) {
      Display.getDisplay(GameMidlet.instance).setCurrent(var0);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.j) {
         try {
            a = (byte)this.l.getSelectedIndex();
            b = Integer.parseInt(this.m.getString());
            c = Integer.parseInt(this.n.getString());
            f = new ByteArrayOutputStream();
            g = new DataOutputStream(f);

            try {
               g.writeByte(a);
               g.writeInt(b);
               g.writeInt(c);
               g.flush();
               g.close();
               f.flush();
               h = RecordStore.openRecordStore("nvhn", true);
               byte[] var3 = f.toByteArray();
               f.close();
               if (h.getNumRecords() == 0) {
                  h.addRecord(var3, 0, var3.length);
               } else {
                  h.setRecord(1, var3, 0, var3.length);
               }

               h.closeRecordStore();
            } catch (Exception var4) {
            }

            GameCanvas.setText("L\u01b0u c\u00e0i \u0111\u1eb7t th\u00e0nh c\u00f4ng");
         } catch (NumberFormatException var5) {
         }
      }

      a(MotherCanvas.getInstance());
   }

   static {
      try {
         if ((h = RecordStore.openRecordStore("nvhn", true)).getNumRecords() != 0) {
            d = new ByteArrayInputStream(h.getRecord(1));
            e = new DataInputStream(d);
            a = e.readByte();
            b = e.readInt();
            c = e.readInt();
         }

         h.closeRecordStore();
      } catch (Exception var1) {
      }

   }
}
