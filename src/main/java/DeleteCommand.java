public class DeleteCommand extends Command {
    private int index;

    public DeleteCommand(int index) {
        this.index = index;
    }

    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) throws DukeException {
        System.out.println(taskList.deleteTask(this.index));
        storage.save(taskList);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
