package java8features;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NeshornTask {

	public static void main(String[] args) throws NoSuchMethodException, ScriptException, FileNotFoundException {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn");
		engine.eval(new FileReader("resources/calci.js"));
	
		
		Bindings bind = engine.getBindings(ScriptContext.ENGINE_SCOPE);
		bind.put("msg", "Calling msg");
		bind.putIfAbsent("msg2", "This is msg 2");
		engine.eval(new FileReader("resources/calci.js"));
		
		// Calling functions from js
		Invocable invocable = (Invocable) engine;
		invocable.invokeFunction("add",2,3);
		invocable.invokeFunction("sub",10,3);
		invocable.invokeFunction("mul",2,3);
		invocable.invokeFunction("div",10,2);

	}

}
