package main;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import ast.*;
import visitor.*;

public class Main {
	public static void main(String[] args) throws IOException{
		FileInputStream stream = new FileInputStream("prog.txt");
        ANTLRInputStream input = new ANTLRInputStream(stream);
        ajew_pvcsLexer lexer = new ajew_pvcsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        ajew_pvcsParser parser = new ajew_pvcsParser(tokens);
        //ParseTree tree = parser.goal();
        
        ASTBuilder builder = new ASTBuilder();
        
        
        Program prog = builder.visitGoal(parser.goal());;
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        prog.accept(visitor);
	}
}
