DB[:disemvowel].multi_insert([
  {str: "This website is for losers LOL!"}, 
  {str: "No offense but,\nYour writing is among the worst I've ever read"}, 
  {str: "What are you, a communist?"}
])
  
results = run_sql

describe :columns do
   it "should return 2 columns" do
    expect(results.columns.count).to eq 2
   end
end

describe :column_names do
   it "should match column names" do
     expect(results.columns[0].to_s).to eq "str" 
     expect(results.columns[1].to_s).to eq "res" 
   end
end

compare_with expected do end