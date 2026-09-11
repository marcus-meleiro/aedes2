import java.time.LocalDate;
import java.util.*;
import java.io.*;

public class Modelagem{
class Veiculo
{

//VARIVEIS DA CLASSE -  DE ACORDO COM A TABELA DA QUESTÃO
	private int id;
	private String marca;
	private String modelo;
	private int ano;
	private String categoria;
	private String[] combustivel;
	private int cilindros;
	private double cilindrada;
	private String transmissao;
	private String tracao;
	private double consumoCidade;
	private double consumoEstrada;
	private double co2;
	private boolean turbo;
	private LocalDate dataRegistro;



	//CRIANDO A CLASSE VEICULO , NÃOS SE O QUE EU FIZ NA VARIAVEL DATRA DE REGISTRO VAI FUNCIONAR VERIFICAR COM O PROFESSOR SE PODE USAR  O LOCAL DATE OU TEM QUE SER NO FORMAT
	public Veiculo()
	{
		this.id = 0;
		this.marca = " ";
		this.modelo = " ";
		this.ano = 0000;
		this.categoria = " ";
		this.combustivel = new String[]{" "," "};
		this.cilindros = 0;
		this.cilindrada = 0.0;
		this.transmissao = " ";
		this.tracao = " ";
		this.consumoCidade = 0.0;
		this.consumoEstrada = 0.0;
		this.co2 = 0.0;
		this.turbo = false;
		this.dataRegistro =LocalDate.now();
	}



	//INICIALIZANDO VEICULO PASSSANDO AS VARIAVEIS
	public Veiculo(int id , String marca , String modelo , int ano , String categoria , String[] combustivel ,int cilindros ,double cilindrada , String transmissao , String tracao , double consumoCidade, double consumoEstrada , double co2 , boolean turbo , String dataRegistro)
	{
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.categoria = categoria;
		this.combustivel =  combustivel;
		this.cilindros = cilindros;
		this.cilindrada = cilindrada;
		this.transmissao = transmissao;
		this.tracao = tracao;
		this.consumoCidade =  consumoCidade;
		this.consumoEstrada = consumoEstrada;
		this.co2 = co2;
		this.turbo = turbo;

		this.dataRegistro = dataRegistro;
	
	}



	//GETTTERS E SETTERS - CRIE DE TODOS DEPOIS AVALIOU QUAL É NECESSARIO OU NÃO
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}

	public String getMarca()
	{
		return marca;
	}
	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	public String getModelo()
	{
		return modelo;
	}
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	public int getAno()
	{
		return ano;
	}
	public void setAno(int ano)
	{
		this.ano = ano;
	}

	public String getCategoria()
	{
		return categoria;
	}
	public void setCategoria(String categoria)
	{
		this.categoria = categoria;
	}

	public String [] getCombustivel()
    {
        return combustivel;
    }
    public void setCombustiveis(String [] combustivel)
    {
        this.combustivel = combustivel;
    }

    public int getCilindros()
    {
        return cilindros;
    }
    public void setCilindros(int cilindro)
    {
        this.cilindros = cilindros;
    }

    public double getCilindrada()
    {
        return cilindrada;
    }
    public void setCilindrada(double cilindrada)
    {
        this.cilindrada = cilindrada;
    }

    public String getTransmissao()
    {
        return transmissao;
    }
    public void setTransmissao(String transmissao)
    {
        this.transmissao = transmissao;
    }


    public String getTracao()
    {
        return tracao;
    }
    public void setTracao(String tracao)
    {
        this.tracao = tracao;
    }

    public double getConsumoCidade()
    {
        return consumoCidade;
    }
    public void setConsumoCidade(double consumoCidade)
    {
        this.consumoCidade = consumoCidade;
    }

    public double getConsumoEsrtrada()
    {
        return consumoEstrada;
    }
    public void setConsumoEstrada(double consumoEstrda)
    {
        this.consumoEstrada = consumoEstrada;
    }

    public double getCo2()
    {
        return co2;
    }
    public void setCo2(double co2)
    {
        this.co2 = co2;
    }

    public boolean getTurbo()
    {
        return turbo;
    }
    public void setTurbo(boolean turbo)
    {
        this.turbo = turbo;
    }

    public LocalDate getData()
    {
        return dataRegistro;
    }
    public void getData(LocalDate dataRegistro)
    {
        this.dataRegistro = dataRegistro;
    }

}



// FUNÇÃO SPLITAR O QUE EU QUERO É : AO CHAMR A FUNÇÃO , COMO O PROGRAMA LE A LINHA INTEIRA DO CSV , DIVIR ESTÁ LINHA EM UM VETOR DE STRINGS
// TEM 2 ATRIBUTOS O PRIMEIRO É O VETOR DE STRINGS QUE VAU RECEBR CADA 'PEDAÇO DA LINHA SEPARADO' , O SEGUNDO E A LINHA COMPLETA
public 	void dividirEtrocarOtipo(String[] partesLinha, String linha ,  int id , String marca , String modelo , int ano ,
                        String categoria , String[] combustivel ,int cilindros ,double cilindrada ,
                        String transmissao , String tracao , double consumoCidade, double consumoEstrada ,
                        double co2 , boolean turbo , LocalDate dataRegistro);
{
	partesLinha = linha.split(",");
	id = Integer.parseInt(partesLinha[0]);
	marca = partesLinha[1];
	modelo = partesLinha[2];
	ano = Integer.parseInt(partesLinha[3]);
	categoria = partesLinha[4];
	combustivel = partesLinha[5].split(";");
	cilindros = Integer.parseInt(partesLinha[6]);
	cilindrada = Double.parseDouble(partesLinha[7]);
	transmissao = partesLinha[8];
	tracao = partesLinha[9];
	consumoCidade = Double.parseDouble(partesLinha[10]);
	consumoEstrada = Double.parseDouble(partesLinha[11]);
	co2 = Double.parseDouble(partesLinha[12]);
	turbo = Boolean.parseBoolean(partesLinha[13]);
	String [] dataSeparada = partesLinha[14].split("-");
	dataRegistro =  LocalDate.of(Integer.parseInt(dataSeparada[2]),Integer.parseInt(dataSeparada[1]),Integer.parseInt(dataSeparada[0]));

}



	public static void main(String[]args)
	{



	}
}

