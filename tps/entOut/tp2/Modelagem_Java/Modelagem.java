<<<<<<< HEAD
=======
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
>>>>>>> 4a4cdfc (Esta faltando concertar o erro de atribuição as variaveis que sao atributos da classe Veiculo , para isso separar a função de separar da atribuir e na atribuir deve retorna um objeto Veiculo)
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


<<<<<<< HEAD
=======

>>>>>>> 4a4cdfc (Esta faltando concertar o erro de atribuição as variaveis que sao atributos da classe Veiculo , para isso separar a função de separar da atribuir e na atribuir deve retorna um objeto Veiculo)
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
	public Veiculo(int id , String marca , String modelo , int ano , String categoria , String combustivel ,int cilindros ,double cilindrada , String transmissao , String tracao , double consumoCidade, double consumoEstrada , double co2 , boolean turbo , LocalDate dataRegistro)
	{
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.categoria = categoria;
		this.combustivel =  combustivel.split(";");
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
    public void setCombustiveis(String combustivel)
    {
        this.combustivel = combustivel.split(";");
    }

    public int getCilindros()
    {
        return cilindros;
    }
	public String getCombustivelFormatado() 
	{
    return "[" + String.join(",", this.combustivel) + "]";
	}
    public void setCilindros(int cilindros)
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
    public void setConsumoEstrada(double consumoEstrada)
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


public class Modelagem
{

// FUNÇÃO SPLITAR O QUE EU QUERO É : AO CHAMR A FUNÇÃO , COMO O PROGRAMA LE A LINHA INTEIRA DO CSV , DIVIR ESTÁ LINHA EM UM VETOR DE STRINGS
// TEM 2 ATRIBUTOS O PRIMEIRO É O VETOR DE STRINGS QUE VAU RECEBR CADA 'PEDAÇO DA LINHA SEPARADO' , O SEGUNDO E A LINHA COMPLETA
<<<<<<< HEAD
public static String[] dividirLinha(String[] partesLinha, String linha)
{
	if (linha.endsWith(";")) {
    linha = linha.substring(0, linha.length() - 1);
		 partesLinha = linha.split(",");
	}

	partesLinha = linha.split(",");

	return partesLinha;
	
}

public static Veiculo atribuir(Veiculo veiculo,String[]partesLinha,int id , String marca , String modelo ,
int ano , String categoria , String combustivel ,int cilindros ,double cilindrada ,
String transmissao , String tracao , double consumoCidade, double consumoEstrada ,
double co2 , boolean turbo , LocalDate dataRegistro)
{
	
	id = Integer.parseInt(partesLinha[0].trim());
	marca = partesLinha[1].trim();
	modelo = partesLinha[2].trim();
	ano = Integer.parseInt(partesLinha[3].trim());
	categoria = partesLinha[4].trim();
	combustivel = partesLinha[5].trim();
	cilindros = Integer.parseInt(partesLinha[6].trim());
	cilindrada = Double.parseDouble(partesLinha[7].trim());
	transmissao = partesLinha[8].trim();
	tracao = partesLinha[9].trim();
	consumoCidade = Double.parseDouble(partesLinha[10].trim());
	consumoEstrada = Double.parseDouble(partesLinha[11].trim());
	co2 = Double.parseDouble(partesLinha[12].trim());
	turbo = Boolean.parseBoolean(partesLinha[13].trim());
	String [] dataSeparada = partesLinha[14].trim().replace(";", "").split("-");
	dataRegistro =  LocalDate.of(Integer.parseInt(dataSeparada[0]),Integer.parseInt(dataSeparada[1]),Integer.parseInt(dataSeparada[2]));

	veiculo   = new Veiculo(id ,marca,modelo,ano,categoria,combustivel,cilindros,cilindrada,transmissao,tracao,consumoCidade,consumoEstrada,co2,turbo,dataRegistro);

	return veiculo;
}

public static void imprimirVeiculo(Veiculo veiculo)
{
		DateTimeFormatter formatoSaida = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("[" +
				veiculo.getId() + " ## " +
				veiculo.getMarca() + " ## " +
				veiculo.getModelo() + " ## " +
				veiculo.getAno() + " ## " +
				veiculo.getCategoria() + " ## " +
				veiculo.getCombustivelFormatado() + " ## " +
				veiculo.getCilindros() + " ## " +
				veiculo.getCilindrada() + " ## " +
				veiculo.getTransmissao() + " ## " +
				veiculo.getTracao() + " ## " +
				String.format(Locale.US, "%.2f", veiculo.getConsumoCidade()) + " ## " +
				String.format(Locale.US, "%.2f", veiculo.getConsumoEsrtrada()) + " ## " +
				String.format(Locale.US, "%.1f", veiculo.getCo2()) + " ## " +
				veiculo.getTurbo() + " ## " +
				veiculo.getData().format(formatoSaida) +
				"]");
}
=======
public static 	void dividirEtrocarOtipo(String[] partesLinha, String linha ,  int id , String marca , String modelo ,
int ano , String categoria , String combustivel ,int cilindros ,double cilindrada ,
String transmissao , String tracao , double consumoCidade, double consumoEstrada ,
double co2 , boolean turbo , LocalDate dataRegistro)
{
	if (linha.endsWith(";")) {
    linha = linha.substring(0, linha.length() - 1);
	}
	partesLinha = linha.split(",");
	id = Integer.parseInt(partesLinha[0].trim());
	marca = partesLinha[1].trim();
	modelo = partesLinha[2].trim();
	ano = Integer.parseInt(partesLinha[3].trim());
	categoria = partesLinha[4].trim();
	combustivel = partesLinha[5].trim();
	cilindros = Integer.parseInt(partesLinha[6].trim());
	cilindrada = Double.parseDouble(partesLinha[7].trim());
	transmissao = partesLinha[8].trim();
	tracao = partesLinha[9].trim();
	consumoCidade = Double.parseDouble(partesLinha[10].trim());
	consumoEstrada = Double.parseDouble(partesLinha[11].trim());
	co2 = Double.parseDouble(partesLinha[12].trim());
	turbo = Boolean.parseBoolean(partesLinha[13].trim());
	String [] dataSeparada = partesLinha[14].trim().replace(";", "").split("-");
	dataRegistro =  LocalDate.of(Integer.parseInt(dataSeparada[0]),Integer.parseInt(dataSeparada[1]),Integer.parseInt(dataSeparada[2]));

}


>>>>>>> 4a4cdfc (Esta faltando concertar o erro de atribuição as variaveis que sao atributos da classe Veiculo , para isso separar a função de separar da atribuir e na atribuir deve retorna um objeto Veiculo)

	public static void main(String[]args)
	{

		//ler linha a linha do arquivo
		String path = "veiculos.csv";

		//Criando as variaveis que vao dentro da classe;
		
<<<<<<< HEAD
		// Quando eu ler a linha , vou dividila ao dividir vou salvar nessa variavel criei a varialve partesLinha2 para ser o retorno da função por que yava dando erro
		//provalvelmente nao precisava mas foi a forma mais rapida e facil de de resolver
		String[] partesLinha1 = new String[16];
		String[] partesLinha2 = new String[16];

		


		//variaveis que serão atribustos da classe veiculo
		//coloque parametros genricos inicialmente pois estava dando erro , nao sabia resolver de outra forma
=======
		// Quando eu ler a linha , vou dividila ao dividir vou salvar nessa variavel
		String[] partesLinha = new String[16];

		//variaveis que serão atribustos da classe veiculo
>>>>>>> 4a4cdfc (Esta faltando concertar o erro de atribuição as variaveis que sao atributos da classe Veiculo , para isso separar a função de separar da atribuir e na atribuir deve retorna um objeto Veiculo)
		int id = 0;
		String marca = "vazio";
		String modelo = "vazio";
		int ano = 0000;
		String categoria = "vazio";
		String combustivel = "vazio ;vazio";
		int cilindros = 0;
		double cilindrada = 0.0 ;
		String transmissao = "vazio";
		String tracao = " 0x0";
		double consumoCidade = 0.0;
		double consumoEstrada = 0.0;
		double co2 = 0.0;
		boolean turbo = false;
		LocalDate dataRegistro = LocalDate.now();

<<<<<<< HEAD
		//Criando o array de veiculos , nesse exercicio vou utilizar os array - nos proximos se precisar eu troco é so uma maneira de salvar os objetos
=======
		//Criano o array de veiculos , nesse exercicio vou utilizar os array
>>>>>>> 4a4cdfc (Esta faltando concertar o erro de atribuição as variaveis que sao atributos da classe Veiculo , para isso separar a função de separar da atribuir e na atribuir deve retorna um objeto Veiculo)
		Veiculo [] veiculos = new Veiculo[550];
		String linha;
		int posVeiculo = 0;

		//Lendo as linhas do arquivo enquanto a linha nao for nula
<<<<<<< HEAD
	
		//Lendo as linahs criando os veiculos passando os atributos e salnado no array veiculos
		try (BufferedReader br = new BufferedReader(new FileReader(path)))	{
=======
		try (BufferedReader br = new BufferedReader(new FileReader(path)))
		{
>>>>>>> 4a4cdfc (Esta faltando concertar o erro de atribuição as variaveis que sao atributos da classe Veiculo , para isso separar a função de separar da atribuir e na atribuir deve retorna um objeto Veiculo)
			
			
			
			br.readLine();
			while ((linha = br.readLine()) != null)
			{
<<<<<<< HEAD
				Veiculo aux = new Veiculo();
				partesLinha2 = dividirLinha(partesLinha1, linha);

				veiculos[posVeiculo] = atribuir(aux,partesLinha2,id ,marca ,modelo , ano ,  categoria , combustivel ,cilindros , cilindrada ,transmissao ,tracao ,consumoCidade,consumoEstrada ,co2 ,turbo ,dataRegistro);
			
			imprimirVeiculo(veiculos[posVeiculo]);
            posVeiculo++;
=======
				dividirEtrocarOtipo(partesLinha,linha ,id ,marca ,modelo , ano ,  categoria , combustivel ,cilindros , cilindrada ,transmissao ,tracao ,consumoCidade,consumoEstrada ,co2 ,turbo ,dataRegistro);
				Veiculo aux = new Veiculo(id ,marca,modelo,ano,categoria,combustivel,cilindros,cilindrada,transmissao,tracao,consumoCidade,consumoEstrada,co2,turbo,dataRegistro);
				//veiculos[posVeiculo] = aux;
				DateTimeFormatter formatoSaida = DateTimeFormatter.ofPattern("dd/MM/yyyy");

				System.out.println("[" +
				veiculos[posVeiculo].getId() + " ## " +
				veiculos[posVeiculo].getMarca() + " ## " +
				veiculos[posVeiculo].getModelo() + " ## " +
				veiculos[posVeiculo].getAno() + " ## " +
				veiculos[posVeiculo].getCategoria() + " ## " +
				veiculos[posVeiculo].getCombustivelFormatado() + " ## " +
				veiculos[posVeiculo].getCilindros() + " ## " +
				veiculos[posVeiculo].getCilindrada() + " ## " +
				veiculos[posVeiculo].getTransmissao() + " ## " +
				veiculos[posVeiculo].getTracao() + " ## " +
				String.format(Locale.US, "%.2f", veiculos[posVeiculo].getConsumoCidade()) + " ## " +
				String.format(Locale.US, "%.2f", veiculos[posVeiculo].getConsumoEsrtrada()) + " ## " +
				String.format(Locale.US, "%.1f", veiculos[posVeiculo].getCo2()) + " ## " +
				veiculos[posVeiculo].getTurbo() + " ## " +
				veiculos[posVeiculo].getData().format(formatoSaida) +
				"]");
				posVeiculo++;
>>>>>>> 4a4cdfc (Esta faltando concertar o erro de atribuição as variaveis que sao atributos da classe Veiculo , para isso separar a função de separar da atribuir e na atribuir deve retorna um objeto Veiculo)

			}

			
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

	
<<<<<<< HEAD
				//criei no vim mas editei algumas partes no vscode e intelij pela facilidade de vixualização , vou testar no vim agora
=======
>>>>>>> 4a4cdfc (Esta faltando concertar o erro de atribuição as variaveis que sao atributos da classe Veiculo , para isso separar a função de separar da atribuir e na atribuir deve retorna um objeto Veiculo)


	}
}

