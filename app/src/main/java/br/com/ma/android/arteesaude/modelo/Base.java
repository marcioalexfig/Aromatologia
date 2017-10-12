package br.com.ma.android.arteesaude.modelo;

/**
 * Created by alex on 05/10/17.
 */

public class Base {
    private Integer id;
    private String descricao;
    private Integer volume;
    private Float valor;

    public Base(Integer id, String descricao, Integer volume, Float valor) {
        this.id = id;
        this.descricao = descricao;
        this.volume = volume;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Base base = (Base) o;

        if (!id.equals(base.id)) return false;
        if (!descricao.equals(base.descricao)) return false;
        if (!volume.equals(base.volume)) return false;
        return valor.equals(base.valor);

    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", volume=" + volume +
                ", valor=" + valor +
                '}';
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + descricao.hashCode();
        result = 31 * result + volume.hashCode();
        result = 31 * result + valor.hashCode();
        return result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
