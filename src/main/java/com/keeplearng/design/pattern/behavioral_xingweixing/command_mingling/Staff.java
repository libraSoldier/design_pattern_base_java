package com.keeplearng.design.pattern.behavioral_xingweixing.command_mingling;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author liangyu
 * @create 2020/4/21 9:54 下午
 * @Description
 */
public class Staff {

    private List<Command> commandList = new ArrayList<Command>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void executeCommands(){
        for(Command command : commandList){
            command.execute();
        }

        commandList.clear();
    }

}
