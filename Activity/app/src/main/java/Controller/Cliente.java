package Controller;

import android.os.Parcel;
import android.os.Parcelable;

public class Cliente implements Parcelable {
    public int codigo;
    public String nome;

    public Cliente(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    protected Cliente(Parcel from) {
        codigo = from.readInt();
        nome = from.readString();
    }

    public static final Creator<Cliente> CREATOR = new Creator<Cliente>() {
        @Override
        public Cliente createFromParcel(Parcel in) {
            return new Cliente(in);
        }

        @Override
        public Cliente[] newArray(int size) {
            return new Cliente[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(codigo);
        dest.writeString(nome);
    }
}
