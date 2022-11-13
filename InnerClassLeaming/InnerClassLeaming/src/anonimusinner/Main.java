package anonimusinner;

public class Main {
    public static void main(String [] args){
        /*GenerallindicatorMonitoringModule generallindicatorMonitoringModule = new GenerallindicatorMonitoringModule();
        ErrorMonitoringModule errorMonitoringModule = new ErrorMonitoringModule();
        SecurityMonitoringModule securityMonitoringModule = new SecurityMonitoringModule();
        generallindicatorMonitoringModule.StartMonitoring();
        errorMonitoringModule.StartMonitoring();
        securityMonitoringModule.StartMonitoring();*/
        MonitoringSystem generallindicatorModuleMonitoring = new MonitoringSystem(){
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал.");
            }
        };
        MonitoringSystem errorMonitoring = new MonitoringSystem(){
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг определение ошибок стартовал.");
            }
        };
        MonitoringSystem securitiMonitoring = new MonitoringSystem(){
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал.");
            }
        };
        generallindicatorModuleMonitoring.startMonitoring();
        errorMonitoring.startMonitoring();
        securitiMonitoring.startMonitoring();

    }
}
/*
class GenerallindicatorMonitoringModule {
    public void StartMonitoring(){
        System.out.println("Мониторинг общих показателей стартовал.");
    }
}

 class ErrorMonitoringModule {
    public void StartMonitoring(){
        System.out.println("Мониторинг отслеживания ошибок стартовал.");
    }
}

 class SecurityMonitoringModule {
    public void StartMonitoring(){
        System.out.println("Мониторинг безопасности стартовал.");
    }
}

*/
