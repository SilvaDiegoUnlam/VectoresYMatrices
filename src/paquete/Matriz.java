package paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import exceptions.DimensionException;

ion{
		if(dim!=o.dim)
			throw new DimensionException("no esta bien");
		Matriz aux= new Matriz(f,c);
		for(int i=0;i<f;i++){
			for(int j=0;j<c;j++){
				aux.cord[i][j]=cord[i][j]-o.cord[i][j];
			}
		}
		return aux;
	}
	public Matriz product(Matriz o) throws DimensionException{
		if(dim!=o.dim||f!=c)
			throw new DimensionException("no esta bien");
		Matriz aux= new Matriz(f,c);
		for(int i=0;i<f;i++){
			for(int j=0;j<c;j++){
				for(int k= 0;k<c;k++){
					aux.cord[i][j]+=cord[i][k]*o.cord[k][j];
				}
			}
		}
		return aux;
	}
	public void show(){
		for(int i=0;i<f;i++){
			for(int j=0;j<c;j++){
				System.out.print(cord[i][j]+" ");
			}
			System.out.print(System.lineSeparator());
		}
	}
}
