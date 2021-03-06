package br.com.ma.android.arteesaude.modelo;

/**
 * Created by alex on 05/10/17.
 */

public class Embalagem {
    private Integer id;
    private String descricao;
    private Integer volume;
    private Float valor;

    public Embalagem(Integer id, String descricao, Integer volume, Float valor) {
        this.id = id;
        this.descricao = descricao;
        this.volume = volume;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Embalagem{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", volume=" + volume +
                ", valor=" + valor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Embalagem embalagem = (Embalagem) o;

        if (!id.equals(embalagem.id)) return false;
        if (!descricao.equals(embalagem.descricao)) return false;
        if (!volume.equals(embalagem.volume)) return false;
        return valor.equals(embalagem.valor);

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

    public String getDescricao() {
        return descricao;
    }

    public Integer getVolume() {
        return volume;
    }

    public Float getValor() {
        return valor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
