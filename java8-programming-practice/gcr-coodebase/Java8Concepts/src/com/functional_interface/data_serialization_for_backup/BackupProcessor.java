package com.functional_interface.data_serialization_for_backup;

public class BackupProcessor {
	
    public static void backup(Object obj) {

        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object: " + obj.getClass().getSimpleName());
            // serialization logic here
        } else {
            System.out.println("Backup not allowed for: " + obj.getClass().getSimpleName());
        }
    }
	
}
