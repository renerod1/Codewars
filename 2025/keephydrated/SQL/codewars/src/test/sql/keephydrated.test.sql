results = run_sql

describe :columns do
   it "should return 3 columns" do
    expect(results.columns.count).to eq 3
   end
end

describe :column_names do
   it "should match column names" do
    expect(results.columns[0].to_s).to eq "id"
    expect(results.columns[1].to_s).to eq "hours"
    expect(results.columns[2].to_s).to eq "liters"
   end
end

describe :values do
   it "should return expected results" do
      tablita=results.to_a
      tablita.each{ |row| expect(row[:liters]).to eq (row[:hours]/2).to_i }
      
    end
end
