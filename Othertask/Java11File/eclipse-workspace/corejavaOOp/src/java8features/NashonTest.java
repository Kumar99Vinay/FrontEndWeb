package java8features;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashonTest {

	public static void main(String[] args) throws ScriptException, FileNotFoundException, NoSuchMethodException {
		ScriptEngine engine=new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval("print('Hello world')");
		engine.eval(new FileReader("resources/demo.js"));
		
		Bindings bind=engine.getBindings(ScriptContext.ENGINE_SCOPE);
		bind.put("msg", "Calling js messege..");
		engine.eval(new FileReader("resources/demo2.js"));
		
		Invocable ivocable=(Invocable) engine;
		ivocable.invokeFunction("show1");
		ivocable.invokeFunction("show2","java");
		ivocable.invokeFunction("show3","java","1.8");

	}

}
