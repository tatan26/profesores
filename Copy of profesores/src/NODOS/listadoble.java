package NODOS;

import javax.swing.JOptionPane;

public class listadoble {

profesor cab[];
profesor fin[];

int contar=0,lleva=0,nose=0,bandera=0;


	public listadoble(){

		cab=new profesor[15];
		fin=new profesor[15];
		
	}
		

	
public void nuevoprofe(int code, String Uno,String dos,String tres){
	
	cab[nose]=new profesor(code,Uno,dos,tres);
	nose++;

}

public void profesormateria(int code, String refe, String hour,String date){		


	profesor aux[];
	aux=new profesor[nose];
	aux=cab;
	
	
for (int i=0;i<nose;i++){
	

	
if(cab[i].codigo==code){
	
	
	
	
	if(cab[i].cabeza==null){
			
		cab[i].cabeza=new materia(code,refe,hour,date);
	
	}
	else
	{
		if(cab[i].cabeza.siguiente==null){
		cab[i].aux2=new materia(code,refe,hour,date);
		cab[i].aux2.anterior=cab[i].cabeza;
		cab[i].cabeza.siguiente=cab[i].aux2;}
		else{
			aux[i].aux2=aux[i].cabeza;
			while(aux[i].aux2.siguiente!=null){
				aux[i].mat=aux[i].aux2;
				aux[i].aux2=aux[i].aux2.siguiente;
				}
	aux[i].mat=new materia(code,refe,hour,date);
	aux[i].aux2.siguiente=aux[i].mat;
	aux[i].mat.anterior=aux[i].aux2;
		
		}
	}
	}
}




}//fin funcion profesormateria

public void imprimematerias(int n){


	profesor aux[];
	aux=new profesor[nose];
	aux=cab;
	
	for (int i =0 ; i <n;i++){
		aux[i].aux2=aux[i].cabeza;
		while(aux[i].aux2.siguiente!=null){
			
			JOptionPane.showMessageDialog(null,"entra:" + aux[i].aux2.titulo);
			aux[i].aux2=aux[i].aux2.siguiente;
		}
		
		
		
		
		
	}
	
	

	}

public String muestra_materia(int n){
	
	profesor aux[];
	aux=new profesor[nose];
	aux=cab;
	
	String a="";


	if(bandera==0){aux[n].aux2=aux[n].cabeza;}
	
if(aux[n].aux2.siguiente!=null){  //cuenta materias
	        if(bandera==0){a=aux[n].aux2.titulo;bandera=1;return a;}
	        aux[n].aux2=aux[n].aux2.siguiente;
	        a=aux[n].aux2.titulo;
	        
	        return a;
		}
	bandera=0;
	
	return a="ya";
}




public String muestra_nombre(int n){
	
	
		profesor aux[];
		String a="";
		aux=cab;
a=aux[n].nombre;
	return a;
	
	
}


//                         muestra apellido
	public String muestra_apell(int n){
		
		profesor aux[];
		String a="";
		aux=cab;
a=aux[n].apellido;	
	return a;
	
	
	
	}
	
//--------------------------	
	public int cuenta(){

		profesor aux[];
		aux=new profesor[nose];
		aux=cab;
		int contador=0;
		
		for (int i=0 ; i <nose;i++){//pasa profesores

			
			aux[i].aux2=aux[i].cabeza;

			
if(aux[i].cabeza!=null){
	//JOptionPane.showMessageDialog(null,"entra: materia" + aux[i].aux2.titulo+ " profesor "+ aux[i].nombre);
	contador++;
	while(aux[i].aux2.siguiente!=null){  //cuenta materias

				aux[i].aux2=aux[i].aux2.siguiente;
		//JOptionPane.showMessageDialog(null,"entra: materia" + aux[i].aux2.titulo+ " profesor "+ aux[i].nombre);
	contador++;		}
	
		}}
		

return contador;
}
	
}