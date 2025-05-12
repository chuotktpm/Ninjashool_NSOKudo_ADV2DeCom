// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;

public final class MenuADV implements CommandListener {
   private static ByteArrayInputStream ada;
   private static DataInputStream aea;
   private static ByteArrayOutputStream afa;
   private static DataOutputStream aga;
   private static RecordStore aha;
   private Form formADV;
   private Command cmdSave;
   private Command cmdCancel;
   private TextField fieldTenDoiThu;
   private TextField fieldMapLoiDai;
   private TextField fieldKhuLoiDai;
   private TextField fieldMapDV;
   private TextField fieldKhuDV;
   private TextField fieldMapCuuSat;
   private TextField fieldKhuCuuSat;
   private TextField fieldXuCuoc;
   private TextField fieldGioDV;
   private TextField fieldPhutDV;
   public static int xuCuocLoiDai;
   public static int mapCuuSat;
   public static int khuCuuSat;

   public MenuADV() {
      this.formADV = new Form("Menu Danh Vọng");
      this.formADV.append(this.fieldGioDV = new TextField("Giờ làm danh vọng", "" + Code.gioADV, 2, 2));
      this.formADV.append(this.fieldPhutDV = new TextField("Phút làm danh vọng", "" + Code.phutADV, 2, 2));
      this.formADV.append(this.fieldXuCuoc = new TextField("Xu cược", "" + xuCuocLoiDai, 10, 2));
      this.formADV.append(this.fieldTenDoiThu = new TextField("Tên Đối Thủ + ',': <Cách nhau bằng dấu phảy ','> ;", Code.nameCharLoiDai, 1024, 0));
      this.formADV.append(this.fieldMapLoiDai = new TextField("Map lôi đài", "" + Code.mapLoiDai, 3, 2));
      this.formADV.append(this.fieldKhuLoiDai = new TextField("Khu lôi đài", "" + Code.khuLoiDai, 3, 2));
      this.formADV.append(this.fieldMapDV = new TextField("Map danh vọng", "" + Code.mapDanhVong, 3, 1));
      this.formADV.append(this.fieldKhuDV = new TextField("Khu danh vọng", "" + Code.khuDanhVong, 3, 1));
      this.formADV.append(this.fieldMapCuuSat = new TextField("Map Cừu Sát", "" + mapCuuSat, 3, 3));
      this.formADV.append(this.fieldKhuCuuSat = new TextField("Khu Cừu Sát", "" + khuCuuSat, 3, 3));
      this.formADV.addCommand(this.cmdSave = new Command("Lưu", 4, 1));
      this.formADV.addCommand(this.cmdCancel = new Command("Hủy", 7, 1));
      this.formADV.setCommandListener(this);
   }

   public final void show() {
      Display.getDisplay(GameMidlet.instance).setCurrent(this.formADV);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.cmdSave) {
         Code.gioADV = Integer.parseInt(this.fieldGioDV.getString());
         Code.phutADV = Integer.parseInt(this.fieldPhutDV.getString());
         xuCuocLoiDai = Integer.parseInt(this.fieldXuCuoc.getString());
         Code.nameCharLoiDai = this.fieldTenDoiThu.getString().trim();
         Code.mapLoiDai = Integer.parseInt(this.fieldMapLoiDai.getString());
         Code.khuLoiDai = Integer.parseInt(this.fieldKhuLoiDai.getString());
         Code.mapDanhVong = Integer.parseInt(this.fieldMapDV.getString());
         Code.khuDanhVong = Integer.parseInt(this.fieldKhuDV.getString());
         mapCuuSat = Integer.parseInt(this.fieldMapCuuSat.getString());
         khuCuuSat = Integer.parseInt(this.fieldKhuCuuSat.getString());

         try {
            afa = new ByteArrayOutputStream();
            (aga = new DataOutputStream(afa)).writeInt(Code.gioADV);
            aga.writeInt(Code.phutADV);
            aga.writeInt(xuCuocLoiDai);
            aga.writeUTF(Code.nameCharLoiDai);
            aga.writeInt(Code.mapLoiDai);
            aga.writeInt(Code.khuLoiDai);
            aga.writeInt(Code.mapDanhVong);
            aga.writeInt(Code.khuDanhVong);
            aga.writeInt(mapCuuSat);
            aga.writeInt(khuCuuSat);
            aga.flush();
            aga.close();
            afa.flush();
            aha = RecordStore.openRecordStore("DanhVong", true);
            byte[] var3 = afa.toByteArray();
            afa.close();
            if (aha.getNumRecords() == 0) {
               aha.addRecord(var3, 0, var3.length);
            } else {
               aha.setRecord(1, var3, 0, var3.length);
            }

            aha.closeRecordStore();
         } catch (Exception var4) {
         }

         Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.getInstance());
         GameCanvas.setText("Lưu cài đặt thành công");
      }

      if (var1 == this.cmdCancel) {
         Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.getInstance());
      }

   }

   public static void load() {
      Code.gioADV = 0;
      Code.phutADV = 0;
      xuCuocLoiDai = 1000;
      Code.nameCharLoiDai = "";
      Code.mapLoiDai = 1;
      Code.khuLoiDai = 22;
      Code.mapDanhVong = -1;
      Code.khuDanhVong = -1;
      mapCuuSat = 23;
      khuCuuSat = 6;

      try {
         if ((aha = RecordStore.openRecordStore("DanhVong", true)).getNumRecords() != 0) {
            ada = new ByteArrayInputStream(aha.getRecord(1));
            Code.gioADV = (aea = new DataInputStream(ada)).readInt();
            Code.phutADV = aea.readInt();
            xuCuocLoiDai = aea.readInt();
            Code.nameCharLoiDai = aea.readUTF();
            Code.mapLoiDai = aea.readInt();
            Code.khuLoiDai = aea.readInt();
            Code.mapDanhVong = aea.readInt();
            Code.khuDanhVong = aea.readInt();
            mapCuuSat = aea.readInt();
            khuCuuSat = aea.readInt();
         }

         aha.closeRecordStore();
      } catch (Exception var1) {
      }

   }

   static {
      load();
   }

   public static void init() {
      ada = null;
      aea = null;
      afa = null;
      aga = null;
      aha = null;
      xuCuocLoiDai = 0;
      mapCuuSat = 0;
      khuCuuSat = 0;
   }
}
