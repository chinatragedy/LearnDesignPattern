package Example0503.Command;

import Example0503.Things.Hottub;

public class HottubOffCommand implements ICommand {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}
	@Override
	public void undo() {

	}
}
