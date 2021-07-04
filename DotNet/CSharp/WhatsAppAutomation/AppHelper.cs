using System.Data;
using System.IO;
using ExcelDataReader;

namespace WhatsAppAutomation
{
    public class AppHelper
    {
        
        public static DataTableCollection ImportExcelFile(string fileName)
        {
            using (var stream = File.Open(fileName, FileMode.Open, FileAccess.Read))
            {
                using (var reader = ExcelReaderFactory.CreateReader(stream))
                {
                    var result = reader.AsDataSet(new ExcelDataSetConfiguration()
                    {
                        ConfigureDataTable = (_) => new ExcelDataTableConfiguration() { UseHeaderRow = true }
                    });

                    return result.Tables;
                }
            }
        }

    }
}